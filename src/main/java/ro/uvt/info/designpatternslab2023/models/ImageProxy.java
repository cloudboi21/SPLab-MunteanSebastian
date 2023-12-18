package ro.uvt.info.designpatternslab2023.models;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

import java.awt.*;
@Entity
@NoArgsConstructor(force = true)
public class ImageProxy extends BaseElement implements  Picture, Visitee{
    private String url;
    private Dimension dim;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return dim;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}