package co.edu.uptc.model;

import co.edu.uptc.prototype.IProtoType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dream implements IProtoType<Dream> {
    private Long id;
    private String description;
    private double duration;
    private double emotionalIntensity;
    private double visualClarity;

    @Override
    public Dream deepClone() {
        return new Dream(this.id, this.description, this.duration, this.emotionalIntensity, this.visualClarity);
    }

    @Override
    public Dream clone() {
        return new Dream(this.id, this.description, this.duration, this.emotionalIntensity, this.visualClarity);
    }
}
