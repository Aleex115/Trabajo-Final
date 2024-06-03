package misclases;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;

/**
 * La clase Graficos crea un gráfico de pastel utilizando la biblioteca JFreeChart y lo muestra en una ventana JFrame.
 * Proporciona un constructor para inicializar los datos del gráfico y configurar la ventana.
 *
 * @autor code
 */
public class Graficos extends JFrame {

    private String[] titulos;
    private Integer[] datos;
    private String titulo;

    /**
     * Constructor para la clase Graficos.
     * Inicializa el gráfico de pastel con los datos proporcionados y configura la ventana JFrame.
     *
     * @param titulos una matriz de Strings que contiene los títulos de las secciones del gráfico de pastel.
     * @param datos una matriz de Integers que contiene los valores de las secciones del gráfico de pastel.
     * @param titulo el título del gráfico de pastel.
     */
    public Graficos(String[] titulos, Integer[] datos, String titulo) {
        this.titulos = titulos;
        this.datos = datos;
        this.titulo = titulo;

        // Crear el conjunto de datos para el gráfico de pastel
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int i = 0; i < titulos.length; i++) {
            dataset.setValue(titulos[i], datos[i]);
        }

        // Crear el gráfico de pastel con los datos proporcionados
        JFreeChart chart = ChartFactory.createPieChart(
                titulo,   // Título del gráfico
                dataset,  // Conjunto de datos
                true,     // Incluir leyenda
                true,     // Incluir tooltips
                false     // Excluir URLs
        );

        // Crear un panel para contener el gráfico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);

        // Configurar la ventana JFrame
        pack();
        setVisible(true);
    }
}
