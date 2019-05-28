public class Body{
    double xxPos;
    double yyPos;
    double xxVel;
    double yyVel;
    double mass;
    String imgFileName;

    public Body(double xP, double yP, double xV, double yV, double m, String img){
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }
    public Body(Body b){
        xxPos = b.xxPos;
        yyPos = b.yyPos;
        xxVel = b.xxVel;
        yyVel = b.yyVel;
        mass = b.mass;
        imgFileName = b.imgFileName;
    }
    public double calcDistance(Body b1){
        double dx = Math.abs(this.xxPos - b1.xxPos);
        double dy = Math.abs(this.yyPos - b1.yyPos);
        dx = dx*dx;
        dy = dy*dy;

        double r = dx + dy;
        r = Math.sqrt(r);

        return r;
    }
    public double calcForceExertedBy(Body b1){
        double G = 6.67e-11;// Nm^2/kg^2
        double fource = (G * this.mass * b1.mass)/Math.sqrt(this.calcDistance(b1));

        return fource; 
    }
    public double calcNetForceExertedByX(Body bodies[]){
        double xCount = 0;
        for(int i = 0; i < bodies.length; i++){
            xCount += calcForceExertedBy(bodies[i]) * Math.abs(this.xxPos - bodies[i].xxPos);
        }
        return xCount;
    }


}