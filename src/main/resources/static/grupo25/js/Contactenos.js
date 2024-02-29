document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('contact-form');
    const errorMessage = document.getElementById('error-message');

    form.addEventListener('submit', function (event) {
        event.preventDefault();
        errorMessage.innerHTML = '';

        const nombres = document.getElementById('nombres');
        const apellidos = document.getElementById('apellidos');
        const correo = document.getElementById('correo');
        const semestre = document.getElementById('semestre');
        const descripcion = document.getElementById('descripcion');

        if (!nombres.value || !apellidos.value || !correo.value || !semestre.value || !descripcion.value) {
            errorMessage.innerHTML = 'Por favor completa todos los campos.';
            return;
        }

        if (nombres.value.length > 100 || apellidos.value.length > 100 || correo.value.length > 100 || descripcion.value.length > 100) {
            errorMessage.innerHTML = 'Por favor asegúrate de que los campos no excedan los 100 caracteres.';
            return;
        }

        const correoRegex = /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i;
        if (!correoRegex.test(correo.value)) {
            errorMessage.innerHTML = 'Por favor ingresa un correo electrónico válido en mayúsculas sin caracteres especiales.';
            return;
        }

        if (semestre.value < 0 || semestre.value > 16) {
            errorMessage.innerHTML = 'El semestre debe estar entre 0 y 16.';
            return;
        }

        // Si todas las validaciones pasan, puedes enviar el formulario aquí
        // Por ejemplo, puedes hacer una solicitud AJAX para enviar los datos al servidor
        // y mostrar un mensaje de éxito al usuario

        alert('¡Formulario enviado con éxito!');
        form.reset();
    });
});
