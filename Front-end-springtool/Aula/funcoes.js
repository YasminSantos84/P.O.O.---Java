//vai requisitar uma api
async function cadastrar(){
    let id= document.getElementById("id").value
    let nome= document.getElementById("nome").value
    let tipo= document.getElementById("tipo").value
    let poder= document.getElementById("poder").value
    let nota= Number(document.getElementById("nota").value)

    let dado
    let metodo // vai conter post ou put
    if(id){ // vai atualizar
        //criar o dado para enviar
        metodo = 'PUT'
        dado={
            id, nome, tipo, poder, nota
        }
    }
    else{ // vai cadastrar
        //criar o dado para enviar
        metodo = 'POST'
        dado={
            nome, tipo, poder, nota
        }
    }
    

    //chamando a api utilizando o fetch
    await fetch('http://localhost:8080/Pokemon', {
        method: metodo,
        body: JSON.stringify(dado),
        headers: {"Content-Type":"application/json; charset=UTF-8"}
    })
    //resposta de sucess "servidor"
    .then(response => {
        alert("Cadastro realizado com sucesso")
        consultar()
    })
    //resposta de error do "servidor"
    .catch(error =>{
        alert(error)
    })
}


// async function cadastrar(){
//     //recuperar dados do usuário
//     let nome = document.getElementById("nome").value
//     let tipo = document.getElementById("tipo").value
//     let poder = document.getElementById("poder").value
//     let nota = Number(document.getElementById("nota").value)

//     let metodo

//     //criar o dado para enviar
//     let dado 

//     if (id){//vai atualizar
//         metodo = 'PUT'
//         dado = {id,nome,tipo,poder,nota}
//     }
//     else{//cadastrar
//         metodo = 'POST'
//         dado = {nome,tipo,poder,nota}
//     }

//     //chamar ou consumir api utilizando fetch
//     await fetch('http://localhost:8080/Pokemon',{
//         method: metodo,
//         body:JSON.stringify(dado),
//         headers:{"Content-Type":"application/json; charset=UTF-8"}
//     })
    
//     .then(resposta =>{
//         alert('Cadastro foi realizado com sucesso')
//         consultar()
//     })
//     .catch(error=>{
//         alert(error)
//     })
// }

async function consultar(){
    //consome a API e recupera os pokemons
    let dados = await fetch('http://localhost:8080/Pokemon')
    .then(response=>{
        return response.json()//atribui os dados em json para dados
    })
    .catch(error=>{
        alert(error)
    })

    //percorrer a variável de dados
    //vamos criar uma variável result para concatenar resposta
    let resposta=''
    dados.map(dado=>{
        resposta += `<tr><td>${dado.nome}</td> <td>${dado.tipo}</td> <td>${dado.poder}</td> <td>${dado.nota}
        </td> <td> <i onClick='remove(${dado.id})'class='bi bi-trash3'> </i> </td> <td> <i onClick="atualiza(${dado.id},'${dado.nome}',
            '${dado.poder}','${dado.tipo}',${dado.nota})" class='bi bi-pencil'> </i> </td> </tr>`
    })
    //colocar a resposta no body da tabela
    document.getElementById("conteudoTabela").innerHTML=resposta
}
//Remove um pokemon do banco de dados
////quem chamar a ação remove pode fazer outra ação antes de receber resposta
async function remove(id){
    let confirma = confirm(`Confirma exclusão do pokemon?`)
    if (confirma){//confirma se é true
    // chama api  -> é sincrona, aguardamos retorno do servidor
    await fetch(`http://localhost:8080/Pokemon/${id}`,{
        method:'DELETE'})
    .then (response=>{//quando o servidor retornou
        alert(`Pokemon foi removido com sucesso`)
        consultar()
    })
    .catch(error =>{//houve erro na comunicação com servidor
        alert(`Problema na remoção`)
    })
}
}

function atualiza(id, nome, tipo, poder,nota){
    document.getElementById("id"    ).value = id
    document.getElementById("nome"  ).value = nome
    document.getElementById("tipo"  ).value = tipo
    document.getElementById("poder" ).value = poder
    document.getElementById("nota"  ).value = nota
}