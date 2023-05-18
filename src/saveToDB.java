
// interface segregation
interface saveData {

    void save();
}

class saveToDB implements saveData {
    public void save(
    ) {
        // write logic
    }
}

class saveToFile implements saveData {
    public void save(
    ) {
        // write logic
    }
}
