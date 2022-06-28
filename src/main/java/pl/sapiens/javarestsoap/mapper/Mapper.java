package pl.sapiens.javarestsoap.mapper;


public interface Mapper <E, Dto> {  //to E to skrot od Entity zeby Entity sie nie mylilo bo Entity to tez adnotacja
    Dto fromEntityToDTO(E entity);
    E fromDtoToEntity(Dto dto);
}
