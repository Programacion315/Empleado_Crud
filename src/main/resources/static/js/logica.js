$(document).ready(function(){

    cargarUsuarios();

    $('#tabla-empleados').DataTable();
});

function cargarUsuarios(){

      const rawResponse = await fetch('empleado/2343', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({a: 1, b: 'Textual content'})
      });
      const content = await rawResponse.json();

      console.log(content);


}