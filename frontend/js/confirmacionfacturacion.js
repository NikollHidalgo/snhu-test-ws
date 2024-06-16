// Función para mostrar los detalles de la reserva
function mostrarDetallesReserva() {
    const referenciaReserva = document.getElementById('referencia-reserva');
    const listaPasajeros = document.getElementById('lista-pasajeros');
    const listaVuelos = document.getElementById('lista-vuelos');
    const montoTotal = document.getElementById('monto-total');

    // Ejemplo de datos (reemplazar con datos reales de la reserva)
    const datosReserva = {
        referenciaReserva: "ABC123",
        pasajeros: [
            { nombre: "Juan Pérez", tipoPasajero: "Adulto" },
            { nombre: "María Gómez", tipoPasajero: "Niño" }
        ],
        vuelos: [
            { origen: "Bogotá", destino: "Miami", fecha: "2024-06-20", hora: "10:00", precio: 1200 },
            { origen: "Miami", destino: "Bogotá", fecha: "2024-06-25", hora: "12:00", precio: 1300 }
        ],
        montoTotal: 2500
    };

    // Mostrar referencia de reserva
    referenciaReserva.textContent = datosReserva.referenciaReserva;

    // Mostrar lista de pasajeros
    listaPasajeros.innerHTML = ''; // Limpiar lista
    datosReserva.pasajeros.forEach(pasajero => {
        const li = document.createElement('li');
        li.textContent = `${pasajero.nombre} (${pasajero.tipoPasajero})`;
        listaPasajeros.appendChild(li);
    });

    // Mostrar lista de vuelos
    listaVuelos.innerHTML = ''; // Limpiar lista
    datosReserva.vuelos.forEach(vuelo => {
        const li = document.createElement('li');
        li.textContent = `${vuelo.origen} - ${vuelo.destino} (${vuelo.fecha} ${vuelo.hora}) - Precio: ${vuelo.precio}`;
        listaVuelos.appendChild(li);
    });

    // Mostrar monto total
    montoTotal.textContent = `$${datosReserva.montoTotal}`;
}

// Función para manejar el clic en el botón "Emitir Boletos"
document.getElementById('btn-emitir-boletos').addEventListener('click', function() {
    // Simular la emisión de boletos (reemplazar con su lógica real)
    console.log("Emitiendo boletos...");
    alert("¡Boletos emitidos con éxito!");

    // Redireccionar al usuario a la página principal o la siguiente (según su flujo)
    // window.location.href = "..."; // Ejemplo de redirección
});

// Función para manejar el clic en el botón "Cancelar"
document.getElementById('btn-cancelar').addEventListener('click', function() {
    // Redireccionar al usuario al formulario de confirmación de la reserva
    window.location.href = "..."; // Ejemplo de redirección
});

// Al cargar la página, mostrar los detalles de la reserva
mostrarDetallesReserva();