package eu.agilejava.jcache;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ivar Grimstad (ivar.grimstad@gmail.com)
 */
public class CacheKey implements Serializable {

    private static final long serialVersionUID = 464769732L;
    
    private int number;
    private String text;
    private long anotherNumber;

    public CacheKey(int number, String text, long anotherNumber) {
        this.number = number;
        this.text = text;
        this.anotherNumber = anotherNumber;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getAnotherNumber() {
        return anotherNumber;
    }

    public void setAnotherNumber(long anotherNumber) {
        this.anotherNumber = anotherNumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.number;
        hash = 17 * hash + Objects.hashCode(this.text);
        hash = 17 * hash + (int) (this.anotherNumber ^ (this.anotherNumber >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CacheKey other = (CacheKey) obj;
        if (this.number != other.number) {
            return false;
        }
        if (this.anotherNumber != other.anotherNumber) {
            return false;
        }
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        return true;
    }
    
    
    
}
