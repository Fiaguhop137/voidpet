package com.bumptech.glide.request;

import H4.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f28679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f28680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile c f28681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f28682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f28683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b.a f28684f;

    public a(Object obj, b bVar) {
        b.a aVar = b.a.CLEARED;
        this.f28683e = aVar;
        this.f28684f = aVar;
        this.f28679a = obj;
        this.f28680b = bVar;
    }

    private boolean a(c cVar) {
        b.a aVar = this.f28683e;
        b.a aVar2 = b.a.FAILED;
        if (aVar != aVar2) {
            return cVar.equals(this.f28681c);
        }
        if (!cVar.equals(this.f28682d)) {
            return false;
        }
        b.a aVar3 = this.f28684f;
        return aVar3 == b.a.SUCCESS || aVar3 == aVar2;
    }

    private boolean b() {
        b bVar = this.f28680b;
        return bVar == null || bVar.canNotifyCleared(this);
    }

    private boolean c() {
        b bVar = this.f28680b;
        return bVar == null || bVar.canNotifyStatusChanged(this);
    }

    private boolean d() {
        b bVar = this.f28680b;
        return bVar == null || bVar.canSetImage(this);
    }

    @Override // H4.c
    public void begin() {
        synchronized (this.f28679a) {
            try {
                b.a aVar = this.f28683e;
                b.a aVar2 = b.a.RUNNING;
                if (aVar != aVar2) {
                    this.f28683e = aVar2;
                    this.f28681c.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.b
    public boolean canNotifyCleared(c cVar) {
        boolean z10;
        synchronized (this.f28679a) {
            try {
                z10 = b() && cVar.equals(this.f28681c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public boolean canNotifyStatusChanged(c cVar) {
        boolean z10;
        synchronized (this.f28679a) {
            try {
                z10 = c() && a(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public boolean canSetImage(c cVar) {
        boolean zD;
        synchronized (this.f28679a) {
            zD = d();
        }
        return zD;
    }

    @Override // H4.c
    public void clear() {
        synchronized (this.f28679a) {
            try {
                b.a aVar = b.a.CLEARED;
                this.f28683e = aVar;
                this.f28681c.clear();
                if (this.f28684f != aVar) {
                    this.f28684f = aVar;
                    this.f28682d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(c cVar, c cVar2) {
        this.f28681c = cVar;
        this.f28682d = cVar2;
    }

    @Override // com.bumptech.glide.request.b
    public b getRoot() {
        b root;
        synchronized (this.f28679a) {
            try {
                b bVar = this.f28680b;
                root = bVar != null ? bVar.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.b, H4.c
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.f28679a) {
            try {
                z10 = this.f28681c.isAnyResourceSet() || this.f28682d.isAnyResourceSet();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // H4.c
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f28679a) {
            try {
                b.a aVar = this.f28683e;
                b.a aVar2 = b.a.CLEARED;
                z10 = aVar == aVar2 && this.f28684f == aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // H4.c
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f28679a) {
            try {
                b.a aVar = this.f28683e;
                b.a aVar2 = b.a.SUCCESS;
                z10 = aVar == aVar2 || this.f28684f == aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // H4.c
    public boolean isEquivalentTo(c cVar) {
        if (cVar instanceof a) {
            a aVar = (a) cVar;
            if (this.f28681c.isEquivalentTo(aVar.f28681c) && this.f28682d.isEquivalentTo(aVar.f28682d)) {
                return true;
            }
        }
        return false;
    }

    @Override // H4.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f28679a) {
            try {
                b.a aVar = this.f28683e;
                b.a aVar2 = b.a.RUNNING;
                z10 = aVar == aVar2 || this.f28684f == aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public void onRequestFailed(c cVar) {
        synchronized (this.f28679a) {
            try {
                if (cVar.equals(this.f28682d)) {
                    this.f28684f = b.a.FAILED;
                    b bVar = this.f28680b;
                    if (bVar != null) {
                        bVar.onRequestFailed(this);
                    }
                    return;
                }
                this.f28683e = b.a.FAILED;
                b.a aVar = this.f28684f;
                b.a aVar2 = b.a.RUNNING;
                if (aVar != aVar2) {
                    this.f28684f = aVar2;
                    this.f28682d.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.b
    public void onRequestSuccess(c cVar) {
        synchronized (this.f28679a) {
            try {
                if (cVar.equals(this.f28681c)) {
                    this.f28683e = b.a.SUCCESS;
                } else if (cVar.equals(this.f28682d)) {
                    this.f28684f = b.a.SUCCESS;
                }
                b bVar = this.f28680b;
                if (bVar != null) {
                    bVar.onRequestSuccess(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H4.c
    public void pause() {
        synchronized (this.f28679a) {
            try {
                b.a aVar = this.f28683e;
                b.a aVar2 = b.a.RUNNING;
                if (aVar == aVar2) {
                    this.f28683e = b.a.PAUSED;
                    this.f28681c.pause();
                }
                if (this.f28684f == aVar2) {
                    this.f28684f = b.a.PAUSED;
                    this.f28682d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
