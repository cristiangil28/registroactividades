$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/listar"
    }).then(function(data) {
       $('.empleado-id').append(data.id);
       $('.empleado-nombre').append(data.nombre);
    });
});