
#import "RNVibrationFeedback.h"
#import <AudioToolbox/AudioServices.h>

@implementation RNVibrationFeedback

@synthesize bridge = _bridge;

RCT_EXPORT_MODULE()

- (void)setBridge:(RCTBridge *)bridge
{
    _bridge = bridge;
}

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_METHOD(vibrateWith:(int)ID)
{
    AudioServicesPlaySystemSound(ID);
}

@end
  
