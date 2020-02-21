
package repositorio;

@Repository

public interface Voto_Repositorio extends JpaRepository <Voto, Spring> {

@Query ("Select c from Voto c Where c.mascota1.id= :id ORDER BY c.fecha DESC")
public List <Voto> buscarVotosPropios (@Param ("id")String id);
    
@Query ("Select c from Voto c Where c.mascota2.id= :id ORDER BY c.fecha DESC")
public List <Voto> buscarVotosRecibidos (@Param ("id")String id);
    
}

    

