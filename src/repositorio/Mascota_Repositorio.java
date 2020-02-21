
package repositorio;


@Repository
public interface Mascota_Repositorio extends JPARepository <Mascota, Spring> {
    @Query ("Select c From Mascota c where c.usuario.id =:id")
    public List <Mascota> buscamosMascotasPorUsuario (@Param ("id") String id);
}
