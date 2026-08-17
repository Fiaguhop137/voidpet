package com.bumptech.glide.request;

import H4.c;

/* JADX INFO: loaded from: classes.dex */
public class ThumbnailRequestCoordinator implements b, c {
    private volatile c full;
    private b.a fullState;
    private boolean isRunningDuringBegin;
    private final b parent;
    private final Object requestLock;
    private volatile c thumb;
    private b.a thumbState;

    public ThumbnailRequestCoordinator(Object obj, b bVar) {
        b.a aVar = b.a.CLEARED;
        this.fullState = aVar;
        this.thumbState = aVar;
        this.requestLock = obj;
        this.parent = bVar;
    }

    private boolean parentCanNotifyCleared() {
        b bVar = this.parent;
        return bVar == null || bVar.canNotifyCleared(this);
    }

    private boolean parentCanNotifyStatusChanged() {
        b bVar = this.parent;
        return bVar == null || bVar.canNotifyStatusChanged(this);
    }

    private boolean parentCanSetImage() {
        b bVar = this.parent;
        return bVar == null || bVar.canSetImage(this);
    }

    @Override // H4.c
    public void begin() {
        synchronized (this.requestLock) {
            try {
                this.isRunningDuringBegin = true;
                try {
                    if (this.fullState != b.a.SUCCESS) {
                        b.a aVar = this.thumbState;
                        b.a aVar2 = b.a.RUNNING;
                        if (aVar != aVar2) {
                            this.thumbState = aVar2;
                            this.thumb.begin();
                        }
                    }
                    if (this.isRunningDuringBegin) {
                        b.a aVar3 = this.fullState;
                        b.a aVar4 = b.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.fullState = aVar4;
                            this.full.begin();
                        }
                    }
                    this.isRunningDuringBegin = false;
                } catch (Throwable th) {
                    this.isRunningDuringBegin = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.b
    public boolean canNotifyCleared(c cVar) {
        boolean z10;
        synchronized (this.requestLock) {
            try {
                z10 = parentCanNotifyCleared() && cVar.equals(this.full) && this.fullState != b.a.PAUSED;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public boolean canNotifyStatusChanged(c cVar) {
        boolean z10;
        synchronized (this.requestLock) {
            try {
                z10 = parentCanNotifyStatusChanged() && cVar.equals(this.full) && !isAnyResourceSet();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public boolean canSetImage(c cVar) {
        boolean z10;
        synchronized (this.requestLock) {
            try {
                z10 = parentCanSetImage() && (cVar.equals(this.full) || this.fullState != b.a.SUCCESS);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // H4.c
    public void clear() {
        synchronized (this.requestLock) {
            this.isRunningDuringBegin = false;
            b.a aVar = b.a.CLEARED;
            this.fullState = aVar;
            this.thumbState = aVar;
            this.thumb.clear();
            this.full.clear();
        }
    }

    @Override // com.bumptech.glide.request.b
    public b getRoot() {
        b root;
        synchronized (this.requestLock) {
            try {
                b bVar = this.parent;
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
        synchronized (this.requestLock) {
            try {
                z10 = this.thumb.isAnyResourceSet() || this.full.isAnyResourceSet();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // H4.c
    public boolean isCleared() {
        boolean z10;
        synchronized (this.requestLock) {
            z10 = this.fullState == b.a.CLEARED;
        }
        return z10;
    }

    @Override // H4.c
    public boolean isComplete() {
        boolean z10;
        synchronized (this.requestLock) {
            z10 = this.fullState == b.a.SUCCESS;
        }
        return z10;
    }

    @Override // H4.c
    public boolean isEquivalentTo(c cVar) {
        if (cVar instanceof ThumbnailRequestCoordinator) {
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = (ThumbnailRequestCoordinator) cVar;
            if (this.full != null ? this.full.isEquivalentTo(thumbnailRequestCoordinator.full) : thumbnailRequestCoordinator.full == null) {
                if (this.thumb == null) {
                    if (thumbnailRequestCoordinator.thumb == null) {
                        return true;
                    }
                } else if (this.thumb.isEquivalentTo(thumbnailRequestCoordinator.thumb)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // H4.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.requestLock) {
            z10 = this.fullState == b.a.RUNNING;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public void onRequestFailed(c cVar) {
        synchronized (this.requestLock) {
            try {
                if (!cVar.equals(this.full)) {
                    this.thumbState = b.a.FAILED;
                    return;
                }
                this.fullState = b.a.FAILED;
                b bVar = this.parent;
                if (bVar != null) {
                    bVar.onRequestFailed(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.b
    public void onRequestSuccess(c cVar) {
        synchronized (this.requestLock) {
            try {
                if (cVar.equals(this.thumb)) {
                    this.thumbState = b.a.SUCCESS;
                    return;
                }
                this.fullState = b.a.SUCCESS;
                b bVar = this.parent;
                if (bVar != null) {
                    bVar.onRequestSuccess(this);
                }
                if (!this.thumbState.g()) {
                    this.thumb.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H4.c
    public void pause() {
        synchronized (this.requestLock) {
            try {
                if (!this.thumbState.g()) {
                    this.thumbState = b.a.PAUSED;
                    this.thumb.pause();
                }
                if (!this.fullState.g()) {
                    this.fullState = b.a.PAUSED;
                    this.full.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setRequests(c cVar, c cVar2) {
        this.full = cVar;
        this.thumb = cVar2;
    }
}
