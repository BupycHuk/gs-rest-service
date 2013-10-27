package domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Contact implements Serializable
{

    private static final long serialVersionUID = 382157955767771714L;


    @Id

    @Column(name = "uuid")

    @GeneratedValue(generator = "system-uuid")

    @GenericGenerator(name = "system-uuid", strategy = "uuid")

    private String id;


    @Column(name = "name")

    private String name;


    public Contact()
    {

    }


    public Contact(String id, String name)
    {
        this.id = id;
        this.name = name;
    }


    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {

        this.id = id;

    }


    public String getName()

    {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }

}
