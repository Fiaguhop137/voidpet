package io.sentry;

import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
final class c4 extends b4 implements Queue {
    private c4(Queue queue) {
        super(queue);
    }

    static c4 e(Queue queue) {
        return new c4(queue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.b4
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Queue a() {
        return (Queue) super.a();
    }

    @Override // java.util.Queue
    public Object element() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            Object objElement = a().element();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return objElement;
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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            boolean zEquals = a().equals(obj);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zEquals;
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
    public int hashCode() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            int iHashCode = a().hashCode();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return iHashCode;
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

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            boolean zOffer = a().offer(obj);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return zOffer;
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

    @Override // java.util.Queue
    public Object peek() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            Object objPeek = a().peek();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return objPeek;
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

    @Override // java.util.Queue
    public Object poll() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            Object objPoll = a().poll();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return objPoll;
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

    @Override // java.util.Queue
    public Object remove() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            Object objRemove = a().remove();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return objRemove;
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
    public Object[] toArray() {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            Object[] array = a().toArray();
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return array;
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
    public Object[] toArray(Object[] objArr) {
        InterfaceC3698e0 interfaceC3698e0A = this.f45686b.a();
        try {
            Object[] array = a().toArray(objArr);
            if (interfaceC3698e0A != null) {
                interfaceC3698e0A.close();
            }
            return array;
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
