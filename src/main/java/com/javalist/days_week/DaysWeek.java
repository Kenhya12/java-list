package com.javalist.days_week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysWeek {
    private List<String> days;

        public DaysWeek() {
            days = new ArrayList<>();
        }

        public void createWeekDays() {
            days.add("Monday");
            days.add("Tuesday");
            days.add("Wednesday");
            days.add("Thursday");
            days.add("Friday");
            days.add("Saturday");
            days.add("Sunday");
        }

        /**
        * Retorna una lista de los días de la semana.
         *
        * @return Lista de días de la semana.
         */ 
        public List<String> getWeekDays() {
            return new ArrayList<>(days);
        }

        /**
         * Retorna el largo de la lista de días de la semana.
        *
        * @return Cuenta los días de la semana.
         */ 
    public int getLength() {
        return days.size();
        }

        /**
        * Elimina un día a la lista de días de la semana.
         *
        * @param day Día a eliminar.
         */
    public boolean removeDay(String day) {
        return days.remove(day);
        }

        /**
         * Obtiene un día específico de la lista de días de la semana.
        *
        * @param index Índice del día a obtener.
        * @return Día de la semana en el índice especificado.
         * @throws IllegalArgumentException si el índice es inválido.
         */
    public String getDay(int index) {
        if (index >= 0 && index < days.size()) {
            return days.get(index);
        }
        throw new IllegalArgumentException("Invalid index");
        }

        /**
         * Verifica si un día específico existe en la lista de días de la semana.
         *
        * @param day Día a verificar.
         * @return true si el día existe, false en caso contrario.
         */ 
    public boolean existsDay(String day) {
    return days.contains(day);
}

        /**
         * Ordena los días de la semana alfabéticamente.
         */ 
    public void sortAlphabetically() {
        Collections.sort(days);
    }

        /**
         * Elimina todos los días de la lista de días de la semana.
        */
    public void clearList() {
        days.clear();
    }
}
