package io.sentry;

import io.sentry.util.C3799a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class b4 implements Collection, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f45685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C3799a f45686b;

    b4(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f45685a = collection;
        this.f45686b = new C3799a();
    }

    protected Collection a() {
        return this.f45685a;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            boolean zAdd = a().add(obj);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zAdd;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            boolean zAddAll = a().addAll(collection);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zAddAll;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public void clear() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            a().clear();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            boolean zContains = a().contains(obj);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zContains;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            boolean zContainsAll = a().containsAll(collection);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zContainsAll;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            boolean zIsEmpty = a().isEmpty();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zIsEmpty;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            boolean zRemove = a().remove(obj);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zRemove;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            boolean zRemoveAll = a().removeAll(collection);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zRemoveAll;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            boolean zRetainAll = a().retainAll(collection);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zRetainAll;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public int size() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            int size = a().size();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return size;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String toString() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            String string = a().toString();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return string;
        } catch (Throwable th) {
            if (interfaceC3698e0A != null) {
                try {
                    interfaceC3698e0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
