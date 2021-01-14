
package boxvolumeoop12;

public class Box {
    double length,width,depth;
    Box(double length,double width,double depth){
    this.length = length;
    this.width = width;
    this.depth = depth;
}
    void DI(){
        double vol = length*width*depth;
        System.out.println("Volume = "+vol);
    }
}
