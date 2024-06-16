const paisPasaporteSelect = document.getElementById('pais-pasaporte');

fetch('/obtener-paises')
    .then(response => response.json())
    .then(paises => {
        paises.forEach(pais => {
            const option = document.createElement('option');
            option.value = pais.id;
            option.textContent = pais.nombre;
            paisPasaporteSelect.appendChild(option);
        });
    })
    .catch(error => console.error('Error al obtener países:', error));

    const fotoPasaporteInput = document.getElementById('foto-pasaporte');
const imagenPasaporteSrc = document.getElementById('imagen-pasaporte-src');
const eliminarPasaporteBtn = document.querySelector('.eliminar-pasaporte');

fotoPasaporteInput.addEventListener('change', function() {
    if (this.files && this.files[0]) {
        const reader = new FileReader();
        reader.onload = function(e) {
            imagenPasaporteSrc.src = e.target.result;
            imagenPasaporteSrc.parentNode.style.display = 'block';
        };
        reader.readAsDataURL(this.files[0]);
    }
});

eliminarPasaporteBtn.addEventListener('click', function() {
    imagenPasaporteSrc.src = '';
    imagenPasaporteSrc.parentNode.style.display = 'none'; // Ocultar el contenedor
});