package pl.sapiens.javarestsoap.solid.exception;

public class Service {

    private DAOReader dao = new DAOReader();

    public Object processData() throws MyCheckedException {
        System.out.println("heavy data processing...");
        return dao.readDataFromDao();
    }
}