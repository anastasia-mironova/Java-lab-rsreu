package com.company;

interface AspirinTab {
    long getAspirinDose();
}
interface ParacetamolTab {
    long getParacetamolDose();
}
interface IbuprofenTab {
    long getIbuprofenDose();
}
interface InteAbsFactory {
    AspirinTab getAspirin();
    ParacetamolTab getParacetamol();
    IbuprofenTab getIbuprofen();
}
class AspirinImp1 implements AspirinTab{

    public long getAspirinDose() {
        return 1;
    }
}
class IbuprofenImp1 implements IbuprofenTab{
    public long getIbuprofenDose() {
        return 2;
    }
}
class ParacetamolImp1 implements ParacetamolTab{
    public long getParacetamolDose() {
        return 3;
    }
}
class UaTabletDoseAbsFactory implements InteAbsFactory{
    public AspirinTab getAspirin() {
        return new AspirinImp1();
    }

    public ParacetamolTab getParacetamol () {
        return new ParacetamolImp1();
    }

    public IbuprofenTab getIbuprofen() {
        return new IbuprofenImp1();
    }
}
class RuAspirinImpl implements AspirinTab {// вторая
    public long getAspirinDose(){
        return 2;
    }
}
class RuParacetamolImpl implements ParacetamolTab{
    public long getParacetamolDose() {
        return 3;
    }
}
class RuIbuprofenImpl implements IbuprofenTab {
    public long getIbuprofenDose() {
        return 4;
    }
}
class AbsFactory implements InteAbsFactory {
    public AspirinTab getAspirin() {
        return new RuAspirinImpl();
    }
    public ParacetamolTab getParacetamol() {
        return new RuParacetamolImpl();
    }
    public IbuprofenTab getIbuprofen () {
        return new RuIbuprofenImpl();
    }

}

