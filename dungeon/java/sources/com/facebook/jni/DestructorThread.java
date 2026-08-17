package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;
import p359u.G;

/* JADX INFO: loaded from: classes2.dex */
public class DestructorThread {
    private static final Thread sThread;
    private static final DestructorStack sDestructorStack = new DestructorStack(null);
    private static final ReferenceQueue sReferenceQueue = new ReferenceQueue();
    private static final DestructorList sDestructorList = new DestructorList();

    /* JADX INFO: renamed from: com.facebook.jni.DestructorThread$1, reason: invalid class name */
    class AnonymousClass1 extends Thread {
        AnonymousClass1(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Destructor destructor = (Destructor) DestructorThread.sReferenceQueue.remove();
                    destructor.destruct();
                    if (destructor.previous == null) {
                        DestructorThread.sDestructorStack.transferAllToList();
                    }
                    DestructorList.drop(destructor);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static abstract class Destructor extends PhantomReference<Object> {
        private Destructor next;
        private Destructor previous;

        private Destructor() {
            super(null, DestructorThread.sReferenceQueue);
        }

        /* synthetic */ Destructor(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Destructor(Object obj) {
            super(obj, DestructorThread.sReferenceQueue);
            DestructorThread.sDestructorStack.push(this);
        }

        protected abstract void destruct();
    }

    private static class DestructorList {
        private final Destructor mHead;

        public DestructorList() {
            Terminus terminus = new Terminus(null);
            this.mHead = terminus;
            ((Destructor) terminus).next = new Terminus(null);
            ((Destructor) terminus).next.previous = terminus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void drop(Destructor destructor) {
            destructor.next.previous = destructor.previous;
            destructor.previous.next = destructor.next;
        }

        public void enqueue(Destructor destructor) {
            destructor.next = this.mHead.next;
            this.mHead.next = destructor;
            destructor.next.previous = destructor;
            destructor.previous = this.mHead;
        }
    }

    private static class DestructorStack {
        private final AtomicReference<Destructor> mHead;

        private DestructorStack() {
            this.mHead = new AtomicReference<>();
        }

        /* synthetic */ DestructorStack(AnonymousClass1 anonymousClass1) {
            this();
        }

        public void push(Destructor destructor) {
            Destructor destructor2;
            do {
                destructor2 = this.mHead.get();
                destructor.next = destructor2;
            } while (!G.a(this.mHead, destructor2, destructor));
        }

        public void transferAllToList() {
            Destructor andSet = this.mHead.getAndSet(null);
            while (andSet != null) {
                Destructor destructor = andSet.next;
                DestructorThread.sDestructorList.enqueue(andSet);
                andSet = destructor;
            }
        }
    }

    private static class Terminus extends Destructor {
        private Terminus() {
            super((AnonymousClass1) null);
        }

        /* synthetic */ Terminus(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.facebook.jni.DestructorThread.Destructor
        protected void destruct() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("HybridData DestructorThread");
        sThread = anonymousClass1;
        anonymousClass1.start();
    }
}
