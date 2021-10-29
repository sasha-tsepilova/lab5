package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public String getDescription() {
        String description = "Flower bucket:\n";
        for (FlowerPack flowerPack : flowerPacks) {
            description += "\t"+flowerPack.getDescription();
        }
        return description;
    }

    public void setFlowerPacks(List<FlowerPack> flowerPacks) {
        this.flowerPacks = new ArrayList<>(flowerPacks);
    }
}
