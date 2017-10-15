$(function(){
	switch(menu){
	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'View Products':
		$('#product').addClass('active');
		break;
	
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
		
	case 'Manage Products':
		$('#manageProduct').addClass('active');
		break;
	default:
		if(menu == 'Home') $('#home').addClass('active');break;
		$('#product').addClass('active');
		$('#a_'+ menu).addClass('active');
		break;
	}
	var $table=$('#productListTable');
	
	if($table.length){
		var jsonURL = '';
		if(window.categoryId ==''){
			jsonURL = window.contextRoot +'/json/data/all/products';
		}else{
			jsonURL = window.contextRoot +'/json/data/category/'+ window.categoryId +'/products';
			
		}
		$table.DataTable({
			
			ajax:{
				url :jsonURL,
				dataSrc :''
			},
			columns:[
				{
					data: 'code',
					mRender:function(data,type,row){
						return '<img src="'+window.contextRoot+'/resources/images/'+data+'.jpg" class="dataTableImage"/>'
					}
				},
				{
					data: 'name'
				},
				{
					data: 'brand'
				},
				{
					data: 'unitPrice',
					mRender:function(data,type,row){
						return '&#8377; ' + data
					}
				},
				{
					data: 'qty',
					mRender:function(data,type,row){
						if(data < 1){
							return '<span style="color:red">Out Of Stock!</span>';
						}
						return data;
					}
				},
				{
					data:'productId',
					bSortable:false,
					mRender:function(data,type,row){
						var src='';
						src +='<a href="'+window.contextRoot+'/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160 ';
						
						if(row.qty < 1){
							src +='<a href="javascript:void(0)"class="btn btn-danger disable"><strike><span class="glyphicon glyphicon-shopping-cart"></span></strike></a> ';
						}else{
							src +='<a href="'+window.contextRoot+'/cart/add/'+data+'/product"class="btn btn-danger"><span class="glyphicon glyphicon-shopping-cart"></span></a> ';
						}
						return src;
					}
				}
			]
			
		});
		
	}
	
	//alert dismiss auto after 3 secound
	var $alert=$('.alert');
	if($alert.length){
		setTimeout(function(){
			$alert.fadeOut('slow');
			
		},3000)
	}
	

});