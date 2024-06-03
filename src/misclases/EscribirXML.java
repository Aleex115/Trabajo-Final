package misclases;

import java.awt.Component;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * La clase EscribirXML proporciona métodos para escribir datos de coches en un archivo XML.
 */
public class EscribirXML {

    /**
     * Escribe los datos de coches en un archivo XML en la carpeta de documentos del usuario.
     *
     * @param modelos     una lista de modelos de coches.
     * @param marcas      una lista de marcas de coches.
     * @param categorias  una lista de categorías de coches.
     * @param estado      una lista de estados de coches.
     * @param km          una lista de kilometrajes de coches.
     * @param cv          una lista de potencias (caballos de vapor) de coches.
     * @param precio      una lista de precios de coches.
     * @param comp        el componente desde el cual se invoca el método, utilizado para mostrar mensajes.
     */
    public static void EscribirXMLCoche(ArrayList<String> modelos, ArrayList<String> marcas, ArrayList<String> categorias, ArrayList<String> estado, ArrayList<Integer> km, ArrayList<Integer> cv, ArrayList<Integer> precio, Component comp) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation imple = builder.getDOMImplementation();
            Document doc = imple.createDocument(null, "Coches", null);
            doc.setXmlVersion("1.0");

            for (int i = 0; i < modelos.size(); i++) {
                Element coche = doc.createElement("coche");
                doc.getDocumentElement().appendChild(coche);
                CrearElemento("marca", marcas.get(i), coche, doc);
                CrearElemento("modelo", modelos.get(i), coche, doc);
                CrearElemento("categoria", categorias.get(i), coche, doc);
                CrearElemento("estado", estado.get(i), coche, doc);
                CrearElemento("km", String.valueOf(km.get(i)), coche, doc);
                CrearElemento("cv", String.valueOf(cv.get(i)), coche, doc);
                CrearElemento("precio", String.valueOf(precio.get(i)), coche, doc);
            }

            Source source = new DOMSource(doc);
            String ruta = System.getProperty("user.home");
            Result result = new StreamResult(new java.io.File(ruta + "\\Documents\\Coches.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            JOptionPane.showMessageDialog(comp, "Creado correctamente en documentos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(comp, e);
        }
    }

    /**
     * Crea y añade un elemento al documento XML.
     *
     * @param nombre el nombre del elemento.
     * @param datos  el valor de texto del elemento.
     * @param coche  el elemento coche al que se añade el nuevo elemento.
     * @param doc    el documento XML.
     */
    private static void CrearElemento(String nombre, String datos, Element coche, Document doc) {
        Element elem = doc.createElement(nombre);
        Text text = doc.createTextNode(datos);
        coche.appendChild(elem);
        elem.appendChild(text);
    }
}
