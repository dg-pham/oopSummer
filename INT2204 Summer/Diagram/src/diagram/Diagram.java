/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.ArrayList;

/**
 *
 * @author Go Eun Sung
 */
public class Diagram {

    ArrayList<Layer> diagrams = new ArrayList<>();

    //method
    public void deleteCircle() {
        for (int i = 0; i < diagrams.size(); i++) {
            for (int j = 0; j < diagrams.get(i).layers.size(); j++) {
                if (diagrams.get(i).layers.get(j) instanceof Circle) {
                    diagrams.get(i).layers.remove(j);
                }
            }
        }
    }

    // use Visible
    public void removeLayer() {
        for (int i = 0; i < diagrams.size(); i++) {
            if (!diagrams.get(i).isVisible()) {
                diagrams.remove(i);
            }
        }
    }

    //clasify
    public void classify() {
        ArrayList<Shape> level = new ArrayList();
        Diagram d = new Diagram();
        Layer s = new Layer();
        for (int i = 0; i < this.diagrams.size(); i++) {
            for (int j = 0; j < this.diagrams.get(i).layers.size(); j++) {
                level.add(this.diagrams.get(i).layers.get(j));
            }
        }

        this.diagrams.clear();
        
        s.layers.add(level.get(0));
        level.remove(0);
        for (int j = 0; j < level.size();) {
            if (level.get(j).getClass() == level.get(level.size() - 1).getClass()) {
                s.layers.add(level.get(j));
                level.remove(j);

            } else {
                j++;
            }
            d.diagrams.add(s);
            s.layers.clear();
        }

        for (int i = 0; i < d.diagrams.size() - 1; i++) {
            this.diagrams.add(d.diagrams.get(i));
        }
    }
}
