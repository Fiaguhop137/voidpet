package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.common.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class DialogFragmentC2334c extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Dialog f31876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f31877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Dialog f31878c;

    public static DialogFragmentC2334c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC2334c dialogFragmentC2334c = new DialogFragmentC2334c();
        Dialog dialog2 = (Dialog) p170j8.r.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC2334c.f31876a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC2334c.f31877b = onCancelListener;
        }
        return dialogFragmentC2334c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f31877b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f31876a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f31878c == null) {
            this.f31878c = new AlertDialog.Builder((Context) p170j8.r.l(getActivity())).create();
        }
        return this.f31878c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
