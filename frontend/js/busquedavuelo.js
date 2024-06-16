
// Función para obtener los datos del formulario
function obtenerDatosFormulario() {
    const origen = document.getElementById('origen').value;
    const destino = document.getElementById('destino').value;
    const tipoCabina = document.getElementById('tipo-cabina-seleccionada').value;
    const fechaSalida = document.getElementById('fecha-salida').value;
    const fechaRegreso = document.getElementById('fecha-regreso').value;
    const retorno = document.getElementById('retorno').checked;
    const soloIda = document.getElementById('solo-ida').checked;

    return {
        origen,
        destino,
        tipoCabina,
        fechaSalida,
        fechaRegreso,
        retorno,
        soloIda
    };
}
document.getElementById('formulario-busqueda').addEventListener('submit', function(e) {
    e.preventDefault();

    const datosFormulario = obtenerDatosFormulario();
    // Simular la búsqueda de vuelos (reemplazar con su lógica de búsqueda real)
    const vuelosIda = [
        { origen: "Bogotá", destino: "Miami", fechaSalida: "2024-06-20", horaSalida: "10:00", numeroVuelo: "AV123", precioCabina: 1200, moneda: "USD" },
        { origen: "Bogotá", destino: "Miami", fechaSalida: "2024-06-21", horaSalida: "18:00", numeroVuelo: "AV456", precioCabina: 1500, moneda: "USD" }
    ];
    const vuelosRegreso = [
        { origen: "Miami", destino: "Bogotá", fechaSalida: "2024-06-25", horaSalida: "12:00", numeroVuelo: "AV789", precioCabina: 1300, moneda: "USD" },
        { origen: "Miami", destino: "Bogotá", fechaSalida: "2024-06-26", horaSalida: "20:00", numeroVuelo: "AV012", precioCabina: 1400, moneda: "USD" }
    ];

    mostrarResultadosBusqueda(vuelosIda, vuelosRegreso);
});