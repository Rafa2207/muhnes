package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.MaterialTb;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-20T16:41:22")
@StaticMetamodel(PedidoTb.class)
public class PedidoTb_ { 

    public static volatile SingularAttribute<PedidoTb, Integer> eIdpedido;
    public static volatile SingularAttribute<PedidoTb, Date> fFecha;
    public static volatile SingularAttribute<PedidoTb, MaterialTb> eIdmaterial;
    public static volatile SingularAttribute<PedidoTb, String> mDescripcion;

}