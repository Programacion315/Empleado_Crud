$(document).ready(function(){

    cargarUsuarios();

    $('#tabla-empleados').DataTable();
});

async function cargarUsuarios(){
      const request = await fetch('empleados', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
      });
      const empleados = await request.json();

      let listadoHtml = '';

      for(let empleado of empleados){

           let empleadoHtml = '<tr><th scope="row">1</th><td>'+empleado.nombre +' '+empleado.apellido+"</td><td>"+ empleado.correo+"</td><td>"+empleado.telefono+'</td><td><a href=""><i class="fas fa-trash"></i></a></td></tr>';

           listadoHtml += empleadoHtml;

      }

      console.log(empleados);


      document.querySelector('#tabla-empleados tbody').outerHTML = listadoHtml;
}