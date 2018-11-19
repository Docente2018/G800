const url = "/api/Usuarios";
const getUsers = async _ => {
    try {
        let divUser = $("#users")

        let res = await fetch(url)
        if (res.status != 200) {
            alert("error al cargar los datos");
            hideLoader();
            return;
        }
        let data = await res.json();
        divUser.empty();
        if (data.length > 0) {
            
            data.forEach(x => {
                divUser.append(`<div class="col-lg-12">${x.nombre} <button class="btn btn-primary" onclick="deleteUser(this.id)" id="${x.id}">Eliminar</button></div><div class="col-lg-12"></br></div>`);
            })
        } else {
            divUser.append('No hay usuarios disponibles');
        }
        hideLoader();
    } catch (e) {
        console.log(e)
    }
}

const addUser = async _ => {
    let nombre = $("#nombre").val(), apellido = $("#apellido").val()
    if (nombre.trim().length == 0 || apellido.trim().length == 0) {
        alert("Los campos no deben estar vacios");
        return;
    }
    showLoader();
    let data = { nombre, apellido };

    let res = await fetch(url, {
        method: 'POST',
        body: JSON.stringify(data), 
        headers: {
            'Content-Type': 'application/json'
        }
    })
    if (res.status >= 200 && res.status <= 299)
        getUsers();
    else
        alert("error al agregar el usuario")
}

const deleteUser = async id => {
    showLoader();
    let res = await fetch(url + "/"+id, {
        method: 'DELETE',
        headers: {
            'Content-Type': 'application/json'
        }
    })
    if (res.status >= 200 && res.status <= 299)
        getUsers();
    else
        alert("error al eliminar el usuario " + id)
}
const showLoader = _ => $(".loader").show();
const hideLoader = _ => $(".loader").hide();
(getUsers)();