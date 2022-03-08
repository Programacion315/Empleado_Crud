$(document).ready(function(){

    cargarUsuarios();

    $('#tabla-empleados').DataTable();
});

async function cargarUsuarios(){
      const request = await fetch('api/empleados', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
      });
      const empleados = await request.json();



      let listadoHtml = '';

      for(let empleado of empleados){

            let botonEliminar = '<a href="#" onclick="eliminarUsuario('+ empleado.id +')"><i class="fas fa-trash"></i></a>';

           let telefonoTexto = usuario.telefono == null ? '-':usuario.telefono;

           let empleadoHtml = '<tr><th scope="row">1</th><td>'+empleado.nombre +' '+empleado.apellido+"</td><td>"+ empleado.correo+"</td><td>"+telefonoTexto+'</td><td>'
           + botonEliminar +
           '</td></tr>';

           listadoHtml += empleadoHtml;

      }

      console.log(empleados);


      document.querySelector('#tabla-empleados tbody').outerHTML = listadoHtml;
}

async function eliminarUsuario(id){

    if(!confirm('Desea eliminar el usuario?')){ //Cartel de si o no automatico, si hizo click en no, corta el flujo
        return;
    }

    const request = await fetch('api/empleados/' + id, {
            method: 'DELETE',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
          });

    location.reload()


}