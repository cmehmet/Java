public interface IEntityRepository<T extends IEntity> {  //Generic Constraints
    void add(T entity);                                  // Sadece veritabanı nesnelerinin kabulünü sağladık
    void remove(T entity);
    void update(T entity);
}
//Repostory Design Pattern