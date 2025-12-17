@Singleton
public class ScopedBeanA {
    private int id;

    public ScopedBean() {
        id = -1;
    }

    private void setId(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }
}

@Singleton
@ApplicationScoped
public class ScopedBeanB {
    private int id;

    public ScopedBean() {
        id = -1;
    }

    private void setId(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }
}

@Singleton
@Dependent
public class ScopedBeanC {
    private int id;

    public ScopedBean() {
        id = -1;
    }

    private void setId(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }
}

@Stateless
public class ScopedBeanD {
    private int id;

    public ScopedBean() {
        id = -1;
    }

    private void setId(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }
}

@Stateless
@Session
public class ScopedBeanE {
    private int id;

    public ScopedBean() {
        id = -1;
    }

    private void setId(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }
}