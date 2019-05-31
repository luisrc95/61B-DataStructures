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
        double force = (G * this.mass * b1.mass)/Math.pow(this.calcDistance(b1),2);

        return force;
    }

   public double calcForceExertedByX(Body b1){
        double force = this.calcForceExertedBy(b1) * (b1.xxPos - this.xxPos);    
        force = force / this.calcDistance(b1);
        return force; 
    }

    public double calcForceExertedByY(Body b1){
        double force = this.calcForceExertedBy(b1) * (b1.yyPos - this.yyPos);    
        force = force / this.calcDistance(b1);
        return force; 
    }

    public double calcNetForceExertedByX(Body[] b1){
        double force = 0;

        for(int i =0; i < b1.length; i++){
            if(b1[i].equals(this))continue;
            force += this.calcForceExertedByX(b1[i]);
        }

        return force;
    }


    public double calcNetForceExertedByY(Body[] b1){
        double force = 0;

        for(int i =0; i < b1.length; i++){
            if(b1[i].equals(this))continue;
            force += this.calcForceExertedByY(b1[i]);
        }

        return force;
    }

}