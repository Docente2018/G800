const url = "http://helpdesktask.gear.host/api/Usuarios";
const getUsers = async _ => {
    try{
        let divUser = $("#users")

        let res = await fetch(url)
        if (res.status != 200) {
            alert("error al cargar los datos")
            return;
        }
        let data = await res.json();
        if(data.length > 0){
            divUser.empty();
            data.forEach(x => {
                divUser.append(`${x.nombre} </br>`);
            })
        }
    }catch(e){
        console.log(e)
    }
}

const addUser = async _ => {
    try{
        let nombre = $("#nombre").val(), apellido = $("#apellido").val()
        if(nombre.trim().length == 0 || apellido.trim().length == 0){
            alert("Los campos no deben estar vacios");
            return ;
        }
        let data = {nombre, apellido};

        let res = await fetch(url, {
        method: 'POST', // or 'PUT'
        body: JSON.stringify(data), // data can be `string` or {object}!
        headers:{
            'Content-Type': 'application/json'
        }
        })
        if(res.status == 200)
            getUsers();
        else
            alert("error al agregar el usuario")
    }catch(e){
        console.log(e)
    }
}

const determinante = (a11,a12,a13,a21,a22,a23,a31,a32,a33) => ((a11*a22*a33)-(a11*a23*a32)-(a12*a21*a33)+(a12*a23*a31)+(a13*a21*a32)-(a13*a22*a31));
(getUsers)();