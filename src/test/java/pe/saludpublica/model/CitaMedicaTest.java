package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CitaMedicaTest {

    @Test
    @DisplayName("Crear una cita médica con datos válidos")
    void shouldCreateAppointmentWithValidData() {
        LocalDateTime fechaHora = LocalDateTime.of(2026, 12, 1, 10, 30);
        CitaMedica cita = new CitaMedica(
                "PAC-01",
                "DOC-01",
                "ESP-01",
                fechaHora,
                "Control general",
                EstadoCita.PROGRAMADA
        );

        assertNotNull(cita);
        assertEquals("PAC-01", cita.getPaciente());
        assertEquals("DOC-01", cita.getDoctor());
        assertEquals("ESP-01", cita.getEspecialidad());
        assertEquals(fechaHora, cita.getFechaHora());
        assertEquals("Control general", cita.getMotivo());
        assertEquals(EstadoCita.PROGRAMADA, cita.getEstado());
    }
}