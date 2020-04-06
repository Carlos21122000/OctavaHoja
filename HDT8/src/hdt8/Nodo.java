package hdt8;

/**
 *
 * @author  Carlos Raxtum
 * carne: 19721
 */
public class Nodo<T extends Comparable>
{
    T Name;
    T Code;
    T Symp;
    
    public Nodo(T nomb,T cod,T sym)
    {
        Name = nomb;
        Code=cod;
        Symp=sym;
    }
    
    /**
     *
     * @param nomb: T
     * Recibe para atributo Name
     */
    public void setName(T nomb)
    {
        this.Name = nomb;
    }
    
    /**
     *
     * @return Name: T
     * Regresa atributo Name
     */
    public T getName()
    {
        return this.Name;
    }  
    
    /**
     *
     * @return Code: T
     * Regresa atribuo Code
     */
    public T getCode() {
        return Code;
    }

    /**
     *
     * @param Code: T
     * Recibe para atributo Code
     */
    public void setCode(T Code) {
        this.Code = Code;
    }

    /**
     *
     * @return Symp: T
     * Regresa atribuo Symp
     */
    public T getSymp() {
        return Symp;
    }

    /**
     *
     * @param Symp: T
     * Recibe para atributo Symp
     */
    public void setSymp(T Symp) {
        this.Symp = Symp;
    }
 
    @Override
    public String toString()
    {
        return  Name.toString()+", "+Symp.toString()+", "+Code.toString();
    }
    
    public int compareTo(T other)
    {
        return Name.compareTo(other);
    }
}