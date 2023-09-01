const itensarea = document.getElementById("itensarea");
fetch("http://localhost:8085/api/v1/area/listar")
.then((response)=>response.json())
.then((rs)=>{
    let dt = "";
    rs.map((itens,ix)=>{
        dt +=`<li>${itens.idarea}</li>
        <li>${itens.tituloarea}</li><br/>`;
    })
    itensarea.innerHTML=dt;
})

const itensunidade = document.getElementById("itensunidade");
fetch("http://localhost:8085/api/v1/unidade/listar")
.then((response)=>response.json())
.then((rs)=>{
    let dt = "";
    rs.map((itens,ix)=>{
        dt +=`<li>${itens.idunidade}</li>
        <li>${itens.nomeunidade}</li>
        <li>${itens.endereco}</li><br/>`;
    })
    itensunidade.innerHTML=dt;
})

const itenscurso = document.getElementById("itenscurso");
fetch("http://localhost:8085/api/v1/curso/listar")
.then((response)=>response.json())
.then((rs)=>{
    let dt = "";
    rs.map((itens,ix)=>{
        dt +=`<li>${itens.idcurso}</li>
        <li>${itens.titulocurso}</li>
        <li>${itens.descricao}</li>
        <li>${itens.cargahoraria}</li>
        <li>${itens.area.idarea}</li>
        <li>${itens.unidade.idunidade}</li><br/>`;
    })
    itenscurso.innerHTML=dt;
})