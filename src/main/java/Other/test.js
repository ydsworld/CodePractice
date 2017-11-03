loadconeter
function(){
    var image=this.getValue() == 'image';
    var video=this.getValue() == 'video';
    var pdf=this.getValue() == 'pdf';
    var alt = this.findParentByType('dialog').getField('./alt');
    var title = this.findParentByType('dialog').getField('./title');
    var url = this.findParentByType('dialog').getField('./url');
    var alignment = this.findParentByType('dialog').getField('./imagePosition');
    var internaltext = this.findParentByType('dialog').getField('./internaltext');
    var shortDescription = this.findParentByType('dialog').getField('./shortDescription');
    var target = this.findParentByType('dialog').getField('./target');

    target.show();

    if(image){
        alt.show();title.show();url.show();alignment.show();internaltext.show();shortDescription.hide();target.hide();
    }
    else if(video){
        alt.show();title.show();url.show();alignment.show();internaltext.show();shortDescription.show();target.hide();
    }
    else if(pdf){
        alt.show();title.show();url.show();alignment.show();internaltext.hide();shortDescription.hide();target.show();
    }
}

sectionchange
function(){
    var image=this.getValue() == 'image';
    var video=this.getValue() == 'video';
    var pdf=this.getValue() == 'pdf';
    var alt = this.findParentByType('dialog').getField('./alt');
    var title = this.findParentByType('dialog').getField('./title');
    var url = this.findParentByType('dialog').getField('./url');
    var alignment = this.findParentByType('dialog').getField('./imagePosition');
    var internaltext = this.findParentByType('dialog').getField('./internaltext');
    var shortDescription = this.findParentByType('dialog').getField('./shortDescription');
    var target = this.findParentByType('dialog').getField('./target');

    if(image){
        alt.show();title.show();url.show();alignment.show();internaltext.show();shortDescription.hide();target.hide();
    }
    else if(video){
        alt.show();title.show();url.show();alignment.show();internaltext.show();shortDescription.show();target.hide();
    }
    else if(pdf){
        alt.show();title.show();url.show();alignment.show();internaltext.hide();shortDescription.hide();target.show();
    }
}