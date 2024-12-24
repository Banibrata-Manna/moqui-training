def moquiTraining = ec.entity.makeValue("moquitraining.MoquiTraining")
moquiTraining.setFields(context, true, null, null)
if(!moquiTraining.trainingId) moquiTraining.setSequencedIdPrimary()
moquiTraining.create()
return;