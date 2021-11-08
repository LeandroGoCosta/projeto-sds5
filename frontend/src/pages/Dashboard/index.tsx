import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutCharts";
import Footer from "components/footer";
import NavBar from "components/NavBar";

function Dashboard() {
    return (
        <>
        <NavBar />
        <div className="container">
          <h1 className="text-primary py-3">DashBord de Vendas</h1>
  
          <div className="row px-3">
            <div className="col-sm-6">
              <h5 className="text-center text-secondary"> Taxa de sucesso (%)</h5>
                  <BarChart />
            </div>
            <div className="col-sm-6">
              <h5 className="text-center text-secondary"> Todas as Venda</h5>
                  <DonutChart />
            </div>
          </div>
  
          <div className="py-3"></div>
            <h2 className="text-primary">Todas as Vendas</h2>
          <DataTable />
  
        </div>
        <Footer />
      </>
    );
  }
  
  export default Dashboard;