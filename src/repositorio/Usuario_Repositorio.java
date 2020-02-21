
package repositorio;
//asdasdHola
@Repository
public interface Usuario_Repositorio extends JpaRepository <Usuario, Spring> {
    @Query ("Select c from Usuario where c.mail= :mail")
    public Usuario buscarPorMail (@Param("mail") String mail);
}
