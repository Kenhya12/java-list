package com.javalist.days_week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase que gestiona una lista de los días de la semana.
 * Utiliza la colección "List" de Java.
 */
public class DaysOfWeekManager {

    // 🧑‍💻 Nuestra "lista" o "cuaderno" privado para guardar los días.
    private List<String> days;

    // 👷‍♂️ El constructor: crea la lista cuando inicias la clase.
    public DaysOfWeekManager() {
        this.days = new ArrayList<>();
    }

    /**
     * ✅ 1. Método para crear y llenar la lista de días.
     */
    public void createDayList() {
        // Usa el método .add() para añadir cada día.
        this.days.add("Lunes");
        this.days.add("Martes");
        this.days.add("Miércoles");
        this.days.add("Jueves");
        this.days.add("Viernes");
        this.days.add("Sábado");
        this.days.add("Domingo");
    }

    /**
     * ✅ 2. Método que retorna la lista completa.
     */
    public List<String> getDaysOfWeek() {
        return this.days;
    }

    /**
     * ✅ 3. Método que retorna el tamaño de la lista.
     */
    public int getListSize() {
        return this.days.size();
    }

    /**
     * ✅ 4. Método para eliminar un día.
     */
    public boolean removeDay(String day) {
        return this.days.remove(day);
    }

    /**
     * ✅ 5. Método que retorna un día por su posición (índice).
     */
    public String getDayByIndex(int index) {
        return this.days.get(index);
    }

    /**
     * ✅ 6. Método para verificar si un día existe en la lista.
     */
    public boolean doesDayExist(String day) {
        return this.days.contains(day);
    }

    /**
     * ✅ 7. Método para ordenar la lista alfabéticamente.
     */
    public void sortDaysAlphabetically() {
        Collections.sort(this.days);
    }

    /**
     * ✅ 8. Método para vaciar la lista por completo.
     */
    public void clearList() {
        this.days.clear();
    }
}
