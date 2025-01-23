// NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
// String channelId = "my_channel_id";

// // Create Notification Channel (Android 8.0+)
// if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//     NotificationChannel channel = new NotificationChannel(channelId, "My Channel", NotificationManager.IMPORTANCE_DEFAULT);
//     notificationManager.createNotificationChannel(channel);
// }

// // Build Notification
// NotificationCompat.Builder builder = new NotificationCompat.Builder(this, channelId)
//         .setSmallIcon(R.drawable.ic_notification)
//         .setContentTitle("New Notification")
//         .setContentText("This is a sample notification")
//         .setPriority(NotificationCompat.PRIORITY_DEFAULT);

// // Show Notification
// notificationManager.notify(1, builder.build());
