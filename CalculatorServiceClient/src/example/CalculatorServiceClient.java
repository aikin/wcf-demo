package example;

import mypackage.BasicHttpBinding_ICalculatorServiceStub;
import mypackage.CalculatorServiceLocator;
import mypackage.ICalculatorService;


/**
 * Created by Administrator on 7/23/2016.
 */
public class CalculatorServiceClient {
  public static void main(String[] argv) {
      try {
          CalculatorServiceLocator locator = new CalculatorServiceLocator();
          ICalculatorService service = locator.getBasicHttpBinding_ICalculatorService();
          // If authorization is required
//          ((BasicHttpBinding_ICalculatorServiceStub)service).setUsername("user3");
//          ((BasicHttpBinding_ICalculatorServiceStub)service).setPassword("pass3");
          // invoke business method
          Integer sum = service.add(1, 2);

          System.out.print(sum);

      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }
  }
}
