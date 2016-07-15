import sample.commands.*
import org.apache.commons.chain.impl.ChainBase

beans {
    getCustomerInfo(GetCustomerInfo)
    testDrive(TestDriveVehicle)
    negotiateSale(NegotiateSale)
    arrangeFinancing(ArrangeFinancing)
    closeSale(CloseSale)

    sellVehicleChain(ChainBase, [getCustomerInfo, testDrive, negotiateSale, arrangeFinancing, closeSale])
}