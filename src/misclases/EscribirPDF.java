package misclases;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 * La clase EscribirPDF proporciona métodos para generar y escribir facturas en formato PDF.
 */
public class EscribirPDF {

    /**
     * Genera un archivo PDF con los detalles de una factura.
     *
     * @param cliente el nombre del cliente.
     * @param vendedor el nombre del vendedor.
     * @param nb el número de bastidor del coche.
     * @param precio el precio del coche.
     * @param a el componente desde el cual se invoca el método, utilizado para mostrar mensajes.
     */
    public void Escribir(String cliente, String vendedor, String nb, int precio, Component a) {
        Document documento = new Document(PageSize.A4.rotate()); // Cambiar a orientación horizontal
        String coche = "";
        String ref = "";
        try {
            com.mysql.jdbc.Connection conexion = (com.mysql.jdbc.Connection) Conex.devolverConex(a);
            String sql = "Select Concat(marca,' ',modelo),ref from coches where n_bastidor like ?;";
            com.mysql.jdbc.PreparedStatement sentencia = (com.mysql.jdbc.PreparedStatement) conexion.prepareStatement(sql);
            sentencia.setString(1, nb);
            ResultSet rs = sentencia.executeQuery();
            rs.next();
            coche = rs.getString(1);
            ref = rs.getString(2);
            rs.close();
            sentencia.close();
            Conex.CerrarConex();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(a, e);
        }
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Downloads/Factura" + coche + ".pdf"));
            documento.open();

            // Añadir título del documento
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Chunk.ALIGN_CENTER);
            parrafo.add(new Chunk("Factura concesionario power tyres\n\n", FontFactory.getFont("Gill Sans MT", 24, Font.BOLD, BaseColor.BLUE))); // Fuente más grande
            parrafo.setSpacingBefore(10);
            parrafo.setSpacingAfter(20);
            documento.add(parrafo);

            // Añadir información del coche
            Paragraph modelo = new Paragraph();
            modelo.setAlignment(Chunk.ALIGN_CENTER);
            modelo.add(new Chunk("Coche: " + coche, FontFactory.getFont("Gill Sans MT", 18, Font.BOLD, BaseColor.DARK_GRAY))); // Fuente más grande
            modelo.setSpacingBefore(10);
            modelo.setSpacingAfter(10);
            documento.add(modelo);

            // Añadir imagen del coche
            Image header = Image.getInstance(getClass().getResource("/img/coches/" + ref));
            header.scaleToFit(500, 750); // Hacer el encabezado más ancho
            header.setAlignment(Chunk.ALIGN_CENTER);
            documento.add(header);

            // Añadir información del cliente y vendedor
            Paragraph cliVen = new Paragraph();
            cliVen.setAlignment(Chunk.ALIGN_CENTER);
            cliVen.add(new Chunk("Cliente: " + cliente.toUpperCase() + "             Vendedor: " + vendedor.toUpperCase(), FontFactory.getFont("Gill Sans MT", 18, Font.BOLD, BaseColor.DARK_GRAY))); // Fuente más grande
            cliVen.setSpacingBefore(30);
            cliVen.setSpacingAfter(20);
            documento.add(cliVen);

            // Añadir información del precio
            Paragraph PrecipP = new Paragraph();
            PrecipP.setAlignment(Chunk.ALIGN_LEFT);
            PrecipP.add(new Chunk("Precio total : " + precio, FontFactory.getFont("Gill Sans MT", 22, Font.BOLD, BaseColor.DARK_GRAY))); // Fuente más grande
            PrecipP.setSpacingBefore(10);
            PrecipP.setSpacingAfter(20);
            documento.add(PrecipP);

            // Cerrar el documento
            documento.close();
            JOptionPane.showMessageDialog(a, "PDF creado correctamente");

            // Abrir el PDF automáticamente si es compatible
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File(ruta + "/Downloads/Factura" + coche + ".pdf");
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        } catch (DocumentException e) {
            JOptionPane.showMessageDialog(a, e);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(a, e);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(a, e);
        }
    }
}
