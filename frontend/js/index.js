$(document).ready(function() {
    // Initialize variables
    let origen;
    let destino;
    let tipoCabina;
    let tipoViaje = "retorno"; // Default value
    let fechaSalida;
    let fechaRegreso;
    let detalleSalida = [];
    let detalleRegreso = [];
    let visualizacionSalida = false;
    let visualizacionRegreso = false;
  
    // Function to clear the flight details tables
    function clearFlightDetails(tableId) {
      $(`#${tableId} tbody`).empty();
    }
  
    // Function to populate the flight details table
    function populateFlightDetails(data, tableId) {
      const tbody = $(`#${tableId} tbody`);
      tbody.empty();
  
      data.forEach(flight => {
        const row = `<tr>
          <td><span class="math-inline">\{flight\.origen\}</td\>
  <td\></span>{flight.destino}</td>
          <td><span class="math-inline">\{flight\.fecha\}</td\>
  <td\></span>{flight.hora}</td>
          <td><span class="math-inline">\{flight\.numeroVuelo\}</td\>
  <td\></span>{flight.precioCabina}</td>
        </tr>`;
        tbody.append(row);
      });
    }
  
    // Handle radio button change for tipoViaje
    $('input[type="radio"]').change(function() {
      tipoViaje = $(this).val();
      if (tipoViaje === "soloIda") {
        $("#fechaRegresoContainer").hide();
        fechaRegreso = "";
      } else {
        $("#fechaRegresoContainer").show();
      }
    });
  
    // Handle checkbox change for visualizaciónSalida
    $("#visualizacionSalida").change(function() {
      visualizacionSalida = $(this).is(":checked");
    });
  
    // Handle checkbox change for visualizaciónRegreso
    $("#visualizacionRegreso").change(function() {
      visualizacionRegreso = $(this).is(":checked");
    });
  
    // Handle "Aplicar" button click (assuming you have logic to fetch flights)
    $("#applyButton").click(function() {
      origen = $("#origen").val();
      destino = $("#destino").val();
      tipoCabina = $("#tipoCabina").val();
      fechaSalida = $("#fechaSalida").val();
      fechaRegreso = tipoViaje === "retorno" ? $("#fechaRegreso").val() : "";
  
      // Simulate fetching flight data (replace with your actual logic)
      detalleSalida = [
        { origen: "Bogotá", destino: "Miami", fecha: "2024-06-20", hora: "10:00", numeroVuelo: "AV123", precioCabina: 1200 },
        { origen: "Bogotá", destino: "Miami", fecha: "2024-06-21", hora: "18:00", numeroVuelo: "AV456", precioCabina: 1500 }
      ];
      detalleRegreso = tipoViaje === "retorno" ? [
        { origen: "Miami", destino: "Bogotá", fecha: "2024-06-25", hora: "12:00", numeroVuelo: "AV789", precioCabina: 1300 },
        { origen: "Miami", destino: "Bogotá", fecha: "2024-06-26", hora: "20:00", numeroVuelo: "AV012", precioCabina: 1400 }
      ] : [];
  
      clearFlightDetails("detalleSalida");
      clearFlightDetails("detalleRegreso");
  
      if (detalleSalida.length > 0) {
        populateFlightDetails(detalleSalida, "detalleSalida");
        $("#detalleSalida").show();
      } else {
        $("#detalleSalida").hide();
      }
  
      if (detalleRegreso.length > 0) {
        populateFlightDetails(detalleRegreso, "detalleRegreso");
        $("#detalleRegresoHeader").show();
        $("#detalleRegreso").show();
      } else {
        $("#detalleRegresoHeader").hide();
        $("#detalleRegreso").hide();
      }
    });
  
    // Placeholder for "Reservar Vuelo" button click (implement your reservation logic here)
    $("#reservarButton").click(function() {
      const pasajeros = $("#pasajeros").val();
    });
});