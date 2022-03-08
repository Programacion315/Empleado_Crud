$(document).ready(function(){

    //on ready
});

async function registrarUsuario(){

    let datos = {};
    datos.nombre = document.getElementById('txtNombre').value;
    datos.apellido = document.getElementById('txtApellido').value;
    datos.email = document.getElementById('txtEmail').value;
    datos.password = document.getElementById('txtPassword').value;

    let repetirPassword = document.getElementById('txtRepetirPassword').value;

    if(repetirPassword !=  datos.password){
        alert('La contraseña que escribiste es diferente');
        return;
    }

      const request = await fetch('api/empleados', {
        method: 'POST', //Post, para crear una nueva entidad a la base de datos.
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        //JSON.stringify : agarra cualquier objeto de JS y lo convierte a un string de json
        body: JSON.stringify(datos)
      });
      const empleados = await request.json();

}

